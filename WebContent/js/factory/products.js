app.factory('products',function($http, $q){
	var me = this;
	me.getProducts = function(){
		var deferredObj = $q.defer();
		$http.get('core/api/product/list').then(
		  function success(response) {
		   deferredObj.resolve(response.data);
		  },
		  function error(response) {
		    deferredObj.reject(false);
		  });
		return deferredObj.promise;
	}
	return me;
});