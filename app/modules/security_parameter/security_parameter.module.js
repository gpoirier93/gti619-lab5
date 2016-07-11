'use strict';

angular.module('gti619_tp5.security_parameter', [])

    .config(['$routeProvider', function($routeProvider) {
      
        $routeProvider.when('/security_parameter', {
            templateUrl: 'modules/security_parameter/view/security_parameter.html',
            controller: 'SecurityParameterCtrl'
        });
    }]);