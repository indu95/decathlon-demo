<div class="alert alert-info" id="successMsg">
	<strong>{{successMsg}}</strong>
</div>
<div class="alert alert-danger" id="errorMsg">{{errorMsg}}</div>
<div class="content-wrap container-fluid"
	style="background-color: beige; margin-left: 30px; margin-right: 30px; margin-top: 20px;">
	<h3>Update order status</h3>
	<div class=" form-group">
		<label for="name">Order Id<span style="color: red">*</span>:
		</label> <input type="text" class="form-control" id="cname" value=""
			ng-model="order.orderId"
			style="width: 20%; display: inline; margin-left: 75px;">
	</div>

	<div class="form-group">
		<label for="status">Select Order status<span
			style="color: red">*</span>:
		</label> <select class="form-control" id="status"
			style="width: 20%; display: inline;">
			<option value=""></option>
			<option value="shipped">shipped</option>
			<option value="cancelled">cancelled</option>
		</select>
	</div>
	<br>
	<div class="col-md-4 text-center">
		<button id="singlebutton" name="singlebutton" class="btn btn-primary"
			ng-click="updateOrderStatus()">update order status</button>
	</div>
</div>