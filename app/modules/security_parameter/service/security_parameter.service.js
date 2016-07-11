'use strict';

angular.module('gti619_tp5.security_parameter')
    .service('SecurityParameterService', function ($q, Restangular) {

        function getSecurityParameters(SecurityParametersId) {

            return Restangular.one('security_parameters/' + SecurityParametersId).get("");
        }

        function updateSecurityParameters(securityParameters) {

            return securityParameters.put();
        }

        return {
            getSecurityParameters: getSecurityParameters,
            updateSecurityParameters: updateSecurityParameters
        };
    });