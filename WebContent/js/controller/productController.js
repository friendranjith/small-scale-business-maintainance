app.controller('productController',['$scope','products','$uibModal',function($scope, products, $uibModal) {
	/*var productsList = productFactory();
	productsList.then(function(data){
		$scope.users = data;
	});*/
	//$scope.productsList = {"product":{"name":"testProduct","userId":10,"cost":200,"company":"testCompany"}};
	$scope.getProducts =function(){
		products.getProducts().then(function(response){
			$scope.productsList =response;
		},function(msg){
			console.log(msg);
		});
		//return $scope.productsList;
	};
	$scope.open = function(){
		$scope.modalInstance = $uibModal.open({
	      controller: 'ProductAddController',
	      controllerAs: 'vm',
	      templateUrl : TEMPLATES_PATH+'products/product-add.html',
	      windowTemplateUrl : TEMPLATES_PATH+'products/product-add.html',
	      resolve: {
	        items: function() {
	          return {
	            title: "title",
	            message: "msg"
	          };
	        }
	      }
	    });
		$scope.modalInstance.result.then(function(){

		},function(){

		});
	};

	/*$scope.close = function(){
		$scope.modalInstance.dismiss('cancel');
	}*/
	
}]);

app.controller('ProductAddController', function($scope){
	$scope.measurments = ["g", "kg", "ltr","ml"];
	
});