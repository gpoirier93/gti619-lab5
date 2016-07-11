'use strict';

angular.module('gti619_tp5.profile')
    .controller('ProfileCtrl', function ($scope, ProfileService) {

        function _initialize() {

            $scope.error = '';

            $scope.profile = null;

            ProfileService.getProfile(1).then(
                function (profile) {

                    $scope.profile = profile;
                },
                function(response) {

                    $scope.error = "Error while getting the profile.";
                });
        }
        
        $scope.submit = function() {

            ProfileService.updateProfile($scope.profile).then(
                function (profile) {

                    $scope.profile = profile;
                }, 
                function(response) {

                    $scope.error = "Error while updating the profile. ";

                    if (response.data === "USERNAME_ALREADY_EXIST") {

                        $scope.error += "Username already exist."
                    }
                });
        };

        _initialize();
    });
