'use strict';

// Declare app level module which depends on views, and components
angular.module('gti619_tp5', [
    'ngRoute',
    'restangular',

    'constants',
    'services',

    'gti619_tp5.login',
    'gti619_tp5.security_parameter',
    'gti619_tp5.profile',
    'gti619_tp5.circle',
    'gti619_tp5.square'
])
    .config(['$locationProvider', '$routeProvider', '$httpProvider', 'RestangularProvider',
        function($locationProvider, $routeProvider, $httpProvider, RestangularProvider) {
        $locationProvider.hashPrefix('!');

        $routeProvider.otherwise({redirectTo: '/login'});

        $httpProvider.defaults.useXDomain = true;
        $httpProvider.defaults.withCredentials = true;
        delete $httpProvider.defaults.headers.common["X-Requested-With"];
        $httpProvider.defaults.headers.common["Accept"] = "application/json";
        $httpProvider.defaults.headers.common["Content-Type"] = "application/json";

        RestangularProvider.setBaseUrl('http://localhost:8080');
    }])

    .factory('authInterceptor', function ($rootScope, $q, $window) {

        function notInLoginPage() {

            return $window.location.pathname.indexOf('login') === -1;
        }

        function notIntLogoutPage() {

            return $window.location.pathname.indexOf('logout') === -1;
        }
    });
