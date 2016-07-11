'use strict';

angular.module('gti619_tp5.square', [])

    .config(['$routeProvider', function($routeProvider) {
      
        $routeProvider.when('/square', {
            templateUrl: 'modules/square/view/square.html',
            controller: 'SquareCtrl'
        });
    }]);