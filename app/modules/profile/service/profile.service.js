'use strict';

angular.module('gti619_tp5.profile')
    .service('ProfileService', function ($q, Restangular) {

        function getProfile(profileId) {

            return Restangular.one('profiles/' + profileId).get("");
        }

        function updateProfile(profile) {

            return profile.put();
        }

        return {
            getProfile: getProfile,
            updateProfile: updateProfile
        };
    });