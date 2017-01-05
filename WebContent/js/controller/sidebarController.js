app.controller("sidebarController", function($scope){
	$scope.addActive = function(element){
		$('.router-link-active').removeClass('router-link-active');
		$scope.element.addClass('router-link-active');
	}
});