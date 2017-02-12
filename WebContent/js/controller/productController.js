app.controller('DialogController',[ function($scope){
	$scope.measurments = ["g", "kg", "ltr","ml"];
	
}]);

app.controller('productController',['$scope', 'products', '$mdDialog', function($scope, products, $mdDialog) {
	$scope.getProducts =function(){
		products.getProducts().then(function(response){
			$scope.productsList =response;
		},function(msg){
			console.log(msg);
		});
		//return $scope.productsList;
	};
	$scope.addProduct = function(ev) {
	    $mdDialog.show({
	      controller: DialogController,
	      templateUrl: TEMPLATES_PATH+'products/product-add.html',
	      parent: angular.element(document.body),
	      targetEvent: ev,
	      clickOutsideToClose:true
	    })
	    .then(function(answer) {
	      $scope.status = 'You said the information was "' + answer + '".';
	    }, function() {
	      $scope.status = 'You cancelled the dialog.';
	    });
	  };

	  function DialogController($scope, $mdDialog) {
		  $scope.measurments = ["g", "kg", "ltr","ml"];
		  $scope.names = ["Emil", "Tobias", "Linus"];
		  //$scope.name = shiva;
		  $scope.hide = function() {
	      $mdDialog.hide();
	    };
	    $scope.cancel = function() {
	      $mdDialog.cancel();
	    };

	    $scope.answer = function(answer) {
	      $mdDialog.hide(answer);
	    };
	  }
	
	/*$scope.open = function(){
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

	$scope.close = function(){
		$scope.modalInstance.dismiss('cancel');
	}*/
	
}]);

app.controller('ProductAddController',[ function($scope){
	$scope.measurments = ["g", "kg", "ltr","ml"];
	
}]);