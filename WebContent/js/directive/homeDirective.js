app.directive("header", function(){
	return {
		restrict : 'E',
		templateUrl : TEMPLATES_PATH+'header.html',
		link: function ($scope, element, attrs) {

        }
	}
});

/*app.directive("footer", function(){
	return {
		restrict : 'E',
		templateUrl : TEMPLATES_PATH+'footer.html'
	}
});*/

app.directive("sidebar", function(){
	return {
		restrict : 'E',
		templateUrl : TEMPLATES_PATH+'sidebar.html',
		link: function ($scope, element, attrs) {

        }
	}
});