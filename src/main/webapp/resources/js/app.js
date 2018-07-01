'use strict';
var decathlonApp = angular.module('decathlonApp',
		[ 'ngRoute' ]);
decathlonApp.config([ '$routeProvider', function($routeProvider) {

	$routeProvider.when("/orderCreation", {
		templateUrl : 'orderCreation',
		controller : 'orderController'
	}).when("/changeOrderStatus", {
		templateUrl : 'changeOrderStatus',
		controller : 'statusController'
	}).when("/welcome", {
		templateUrl : 'welcome',
		controller : 'welcomeController'
	});
} ]);


