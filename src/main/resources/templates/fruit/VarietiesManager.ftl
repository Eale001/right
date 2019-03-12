<#include "/common/commoncss.ftl">
<#include "/common/modalTip.ftl"/>
<style type="text/css">
a {
	color: black;
}

a:hover {
	text-decoration: none;
}

.bgc-w {
	background-color: #fff;
}
</style>

<div class="row" style="padding-top: 10px;">
	<div class="col-md-2">
		<h1 style="font-size: 24px; margin: 0;" class="">品种管理</h1>
	</div>
	<div class="col-md-10 text-right">
		<a href="##"><span class="glyphicon glyphicon-home"></span> 首页</a> > <a
			disabled="disabled">品种管理</a>
	</div>
</div>
<div class="row" style="padding-top: 15px;">
	<div class="col-md-12">
		<!--id="container"-->
		<div class="bgc-w box box-primary">
			<!--盒子头-->
			<div class="box-header">
				<h3 class="box-title">
					<a href="findvarietiesById" class="label label-success" style="padding: 5px;">
						<span class="glyphicon glyphicon-plus"></span> 新增
					</a>
				</h3>
				<!-- <div class="box-tools">
					<div class="input-group" style="width: 150px;">
						<input type="text" class="form-control input-sm"
							placeholder="查找..." />
						<div class="input-group-btn">
							<a class="btn btn-sm btn-default"><span
								class="glyphicon glyphicon-search"></span></a>
						</div>
					</div>
				</div> -->
			</div>
			<!--盒子身体-->
			<div class="box-body no-padding">
				<div class="table-responsive">
					<table class="table table-hover table-striped">
						<tr>
							
							<th scope="col">名称</th>
							<th scope="col">盛产地</th>
							<th scope="col">成熟时间</th>
							<th scope="col">价格</th>
							<th scope="col">操作</th>
						</tr>
						<#list varieties as variety>
							<tr>
								<td><span>${variety.varietiesName}</span></td>
								<td><span>${(variety.varietiesAddr)!''}</span></td>
								<td><span>${(variety.varietiesDate)!''}</span></td>
								<td><span>${(variety.varietiesPrice)!''}</span></td>
								<td><a  href="findvarietiesById?varietiesId=${variety.varietiesId}" class="label xiugai"><span
										class="glyphicon glyphicon-edit"></span> 修改</a>
                                    <a href="removeVarieties?varietiesId=${variety.varietiesId}" onclick="{return confirm('删除该记录将不能恢复，确定删除吗？');};" class="label shanchu"><span
                                            class="glyphicon glyphicon-remove"></span> 删除</a>
							</tr>
						</#list>
					</table>
				</div>
			</div>
		</div>
	</div>
</div>
