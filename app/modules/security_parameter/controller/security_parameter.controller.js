'use strict';

angular.module('gti619_tp5.security_parameter')
    .controller('SecurityParameterCtrl', function ($scope, SecurityParameterService) {

        function _initialize() {
            
            $scope.error = '';
            
            $scope.securityParameters = null;

            SecurityParameterService.getSecurityParameters(1).then(
                function (securityParameters) {

                    $scope.securityParameters = securityParameters;
                },
                function(response) {

                    $scope.error = "Error while getting the security parameters. ";
                });
        }
        
        $scope.submit = function() {

            SecurityParameterService.updateSecurityParameters($scope.securityParameters).then(
                function (securityParameters) {

                    $scope.securityParameters = securityParameters;
                }, 
                function(response) {

                    $scope.error = "Error while updating the security parameters.";
                });
        };

        _initialize();
    });
