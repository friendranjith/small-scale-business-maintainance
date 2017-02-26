

app.controller('productController',['$scope', 'products', '$http','ModalService', function($scope, products, $http,ModalService) {
	$scope.getProducts =function(){
		products.getProducts().then(function(response){
			$scope.productsList =response;
		},function(msg){
			console.log(msg);
		});
	};
	$scope.addProduct = function(ev) {
		var modal = ModalService.showModal({
	          templateUrl: TEMPLATES_PATH+"products/product-add.html",
	          controller: ProductAddController}).then(function (modal) {
	            // Modal has been loaded...
	        	$("#product-add-modal").modal();
	            modal.element.modal("open");
	        	  
	        });
		
		
		
	  };

	  function ProductAddController($scope) {
		  $scope.measurments = [
		                  { id: 1, name: 'g' },
		                  { id: 2, name: 'kg' },
		                  { id: 3, name: 'ltr' },
		                  { id: 3, name: 'ml' }
		                ];
		  $scope.names = ["Emil", "Tobias", "Linus"];
		  //$scope.name = shiva;
		  $scope.hide = function() {
		  $('#productAddModal').modal('close');
	    };
	    $scope.cancel = function() {
	    	$('#productAddModal').modal('close');
	    };

	    $scope.answer = function(answer) {
	      alert("success");
	    };
	  }
	
}]);

app.controller('ProductAddController',[ function($scope){
	//$scope.measurments = ["g", "kg", "ltr","ml"];
	
}]);