var TEMPLATES_PATH = "/small-scale-business-maintainance/html/";

var app = angular.module('myApp', ['ngRoute', 'ngAnimate', 'ui.bootstrap']);


app.config(['$routeProvider',function($routeProvider) {
	$routeProvider.when('/home', {
		templateUrl : TEMPLATES_PATH+'products/product-list.html',
		controller : 'productController'
	}).when('/', {
		templateUrl : TEMPLATES_PATH+"products/product-list.html",
		controller : 'productController'
	}).otherwise("/", {
		templateUrl : TEMPLATES_PATH+'products/product-list.html',
		controller : 'productController'
	});
	
}]);