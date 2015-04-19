<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="fr">

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>Forum International</title>

<!-- Bootstrap Core CSS -->
<link href="<c:url value='/resources/css/bootstrap.min.css'/>"
	rel="stylesheet">

<!-- Custom CSS -->
<link href="<c:url value='/resources/css/sb-admin.css'/>"
	rel="stylesheet">

<!-- Morris Charts CSS -->
<link href="<c:url value='/resources/css/plugins/morris.css'/>"
	rel="stylesheet">

<!-- Custom Fonts -->
<link
	href="<c:url value='/resources/font-awesome/css/font-awesome.min.css'/>"
	rel="stylesheet" type="text/css">

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>

	<div id="wrapper">

		<!-- Navigation -->
		<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
			<!-- Brand and toggle get grouped for better mobile display -->
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target=".navbar-ex1-collapse">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#">FORUM <font color="#E54545">PM</font>
				</a>
			</div>
			<!-- Top Menu Items -->
			<ul class="nav navbar-right top-nav">
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown"><i class="fa fa-envelope"></i> <b
						class="caret"></b></a>
					<ul class="dropdown-menu message-dropdown">
						<li class="message-preview"><a href="#">
								<div class="media">
									<span class="pull-left"> <img class="media-object"
										src="http://placehold.it/50x50" alt="">
									</span>
									<div class="media-body">
										<h5 class="media-heading">
											<strong>KAMAL HAFYANE</strong>
										</h5>
										<p class="small text-muted">
											<i class="fa fa-clock-o"></i> Yesterday at 4:32 PM
										</p>
										<p>Lorem ipsum dolor sit amet, consectetur...</p>
									</div>
								</div>

						</a></li>
						<li class="message-preview"><a href="#">
								<div class="media">
									<span class="pull-left"> <img class="media-object"
										src="http://placehold.it/50x50" alt="">
									</span>
									<div class="media-body">
										<h5 class="media-heading">
											<strong>John Smith</strong>
										</h5>
										<p class="small text-muted">
											<i class="fa fa-clock-o"></i> Yesterday at 4:32 PM
										</p>
										<p>Lorem ipsum dolor sit amet, consectetur...</p>
									</div>
								</div>
						</a></li>
						<li class="message-preview"><a href="#">
								<div class="media">
									<span class="pull-left"> <img class="media-object"
										src="http://placehold.it/50x50" alt="">
									</span>
									<div class="media-body">
										<h5 class="media-heading">
											<strong>John Smith</strong>
										</h5>
										<p class="small text-muted">
											<i class="fa fa-clock-o"></i> Yesterday at 4:32 PM
										</p>
										<p>Lorem ipsum dolor sit amet, consectetur...</p>
									</div>
								</div>
						</a></li>
						<li class="message-footer"><a href="#">Read All New
								Messages</a></li>
					</ul></li>
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown"><i class="fa fa-bell"></i> <b
						class="caret"></b></a>
					<ul class="dropdown-menu alert-dropdown">
						<li><a href="#">Alert Name <span
								class="label label-default">Alert Badge</span></a></li>
						<li><a href="#">Alert Name <span
								class="label label-primary">Alert Badge</span></a></li>
						<li><a href="#">Alert Name <span
								class="label label-success">Alert Badge</span></a></li>
						<li><a href="#">Alert Name <span class="label label-info">Alert
									Badge</span></a></li>
						<li><a href="#">Alert Name <span
								class="label label-warning">Alert Badge</span></a></li>
						<li><a href="#">Alert Name <span
								class="label label-danger">Alert Badge</span></a></li>
						<li class="divider"></li>
						<li><a href="#">View All</a></li>
					</ul></li>
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown"><i class="fa fa-user"></i> John Smith <b
						class="caret"></b></a>
					<ul class="dropdown-menu">
						<li><a href="#"><i class="fa fa-fw fa-user"></i> Profile</a>
						</li>
						<li><a href="#"><i class="fa fa-fw fa-envelope"></i>
								Inbox</a></li>
						<li><a href="#"><i class="fa fa-fw fa-gear"></i> Settings</a>
						</li>
						<li class="divider"></li>
						<li><a href="#"><i class="fa fa-fw fa-power-off"></i> Log
								Out</a></li>
					</ul></li>
			</ul>
			<!-- Sidebar Menu Items - These collapse to the responsive navigation menu on small screens -->
			<div class="collapse navbar-collapse navbar-ex1-collapse">
				<ul class="nav navbar-nav side-nav">
					<li class="active"><a href="#"><i
							class="fa fa-fw fa-dashboard"></i>Dashboard</a></li>


					<li><a href="#"><i class="fa fa-fw fa-wrench"></i>
							Parametres</a></li>

					<li><a href="javascript:;" data-toggle="collapse"
						data-target="#demo"><i class="fa fa-fw fa-arrows-v"></i>
							Gestion <i class="fa fa-fw fa-caret-down"></i></a>
						<ul id="demo" class="collapse">
							<li><a href="#">Ville Client</a></li>
							<li><a href="#">Projet</a></li>
						</ul></li>
					<li><a href="blank-page.html"><i class="fa fa-fw fa-file"></i>
							Blank Page</a></li>
					<li><a href="index-rtl.html"><i
							class="fa fa-fw fa-dashboard"></i> RTL Dashboard</a></li>
				</ul>
			</div>
			<!-- /.navbar-collapse -->
		</nav>

		<div id="page-wrapper">


			<div class="row">
				<div class="col-lg-12">
					<h1 class="page-header">
						Dashboard <small>Gestion Ville Client</small>
					</h1>
					<ol class="breadcrumb">
						<li class="active"><i class="fa fa-dashboard"></i> Dashboard</li>
					</ol>
				</div>
			</div>
			<!-- AAA -->

			<div class="panel panel-default">
				<div class="panel-heading">
					<h3 class="panel-title">
						<i class="fa fa-money fa-fw"></i> Gestion Ville Client
					</h3>
				</div>
				<div class="panel-body">
					<!-- 					<form action="ajoutvilleclient" method="post"> -->


					<button type="submit" class="btn btn-danger" data-toggle="modal"
						data-target="#dialogvilleclt">
						<span class="glyphicon glyphicon-plus"></span> Add
					</button>

					<form action="ajoutvilleclient" method="post">
						<div id="dialogvilleclt" class="modal fade" role="dialog"
							aria-labelledby="mySmallModalLabel" aria-hidden="true">
							<div class="modal-dialog">
								<div class="modal-content">
									<div class="modal-header">
										<button type="button" class="close" data-dismiss="modal"
											aria-label="Close">
											<span aria-hidden="true">&times;</span>
										</button>
										<h4 class="modal-title" id="gridSystemModalLabel">Add
											Ville Client</h4>
									</div>
									<div class="modal-body">
										<div class="container-fluid">
											<!-- 									111111111111111111111111111111111111111111111111111111111111111 -->
											<div class="form-horizontal">
												<div class="form-group">
													<label for="exampleInputName2"
														class="col-sm-2 control-label col-lg-3">Nom de
														ville : </label>
													<div class="col-xs-8">
														<input type="text" class="form-control col-xs-4"
															id="exampleInputName2" name="nom"
															placeholder="Casablanca" autocomplete="off">
													</div>
												</div>
												<div class="form-group">
													<label for="exampleInputName2"
														class="col-sm-2 control-label col-lg-3">D�scription
														: </label>
													<div class="col-xs-8">
														<textarea class="form-control col-xs-4" rows="3"
															placeholder="D�scription" name="description"></textarea>
													</div>
												</div>
											</div>


											<!-- 									1111111111111111111111111111111111111111111111111111111 -->
										</div>
									</div>
									<div class="modal-footer">
										<button type="submit" class="btn btn-danger">
											<span class="glyphicon glyphicon-ok"></span> Save
										</button>
										<button type="button" class="btn btn-default"
											data-dismiss="modal">
											<span class="glyphicon glyphicon-remove"></span> Cancel
										</button>

									</div>
								</div>
								<!-- /.modal-content -->
							</div>
							<!-- /.modal-dialog -->
						</div>
					</form>




					<form action="actionvilleclt" method="post">
						<div class="table-responsive">
							<table class="table">
								<thead>
									<tr>
										<th>ID</th>
										<th>NOM</th>
										<th>DESCRIPTION</th>
										<th>ACTION</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach items="${listvilleclt}" var="villeclt">

										<tr>
											<td>${villeclt.idVille}</td>
											<td>${villeclt.nom}</td>
											<td>${villeclt.description}</td>
											<td>
												<!-- 											<input type="submit" class="btn btn-danger" -->
												<!-- 												value="Modifier" /> <input type="submit" -->
												<!-- 												class="btn btn-danger" value="Supprimer" /> -->

												<input name="idupdate" type="hidden" value="${villeclt.idVille}"/>
												<input name="nomupdate" type="hidden" value="${villeclt.nom}"/>
												<input name="descripupdate" type="hidden" value="${villeclt.description}"/>

												<button name="update" type="submit" data-toggle="modal"
													data-target="#updatevilleclt" class="btn btn-danger">
													<span class="glyphicon glyphicon-edit"></span> Edit
												</button>

												<button type="button" data-toggle="modal"
													data-target="#deletedialog" class="btn btn-danger">
													<span class="glyphicon glyphicon-trash"></span> Delete
												</button>
											</td>
										</tr>
										<input type="hidden" name="idelete"
											value="${villeclt.idVille}" />
									</c:forEach>
								</tbody>
							</table>
						</div>
						<!--                                             DELETE -->
						<div class="modal fade" id="deletedialog" tabindex="-1"
							role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
							<div class="modal-dialog">
								<div class="modal-content">
									<div class="modal-header">
										<button type="button" class="close" data-dismiss="modal"
											aria-hidden="true">&times;</button>
										<h4 class="modal-title" id="H3">Suppression Ville Client</h4>
									</div>
									<div class="modal-body">�tes-vous s�r de vouloir
										supprimer cette ville</div>
									<div class="modal-footer">
										<button type="button" class="btn btn-default"
											data-dismiss="modal">Cancel</button>
										<button name="delete" type="submit" class="btn btn-danger">Delete</button>
									</div>
								</div>
							</div>
						</div>
						<!-- 													Update -->

						<div id="updatevilleclt" class="modal fade" role="dialog"
							aria-labelledby="mySmallModalLabel" aria-hidden="true">
							<div class="modal-dialog">
								<div class="modal-content">
									<div class="modal-header">
										<button type="button" class="close" data-dismiss="modal"
											aria-label="Close">
											<span aria-hidden="true">&times;</span>
										</button>
										<h4 class="modal-title" id="gridSystemModalLabel">Update
											Ville Client</h4>
									</div>
									<div class="modal-body">
										<div class="container-fluid">
											<!-- 									111111111111111111111111111111111111111111111111111111111111111 -->
											<div class="form-horizontal">

												<div class="form-group">
													<label for="exampleInputName2"
														class="col-sm-2 control-label col-lg-3">ID de
														ville : </label>
													<div class="col-xs-8">
														<input type="text" id="${villecltup.id}" class="form-control col-xs-4"
															id="exampleInputName2" name="nom" autocomplete="off">
													</div>
												</div>
												<div class="form-group">
													<label for="exampleInputName2"
														class="col-sm-2 control-label col-lg-3">Nom de
														ville : </label>
													<div class="col-xs-8">
														<input type="text" value="${villecltup.nom}" class="form-control col-xs-4"
															id="exampleInputName2" name="nom" autocomplete="off">
													</div>
												</div>
												<div class="form-group">
													<label for="exampleInputName2"
														class="col-sm-2 control-label col-lg-3">D�scription
														: </label>
													<div class="col-xs-8">
														<textarea  class="form-control col-xs-4" rows="3"
															name="description"></textarea>
													</div>
												</div>
											</div>


											<!-- 									1111111111111111111111111111111111111111111111111111111 -->
										</div>
									</div>
									<div class="modal-footer">
										<button  type="submit" class="btn btn-danger">
											<span class="glyphicon glyphicon-ok"></span> Update
										</button>
										<button type="button" class="btn btn-default"
											data-dismiss="modal">
											<span class="glyphicon glyphicon-remove"></span> Cancel
										</button>

									</div>
								</div>
								<!-- /.modal-content -->
							</div>
							<!-- /.modal-dialog -->
						</div>
					</form>
					<!-- /#page-wrapper -->
				</div>

			</div>

		</div>
	</div>
	<!-- /#wrapper -->

	<!-- jQuery -->
	<script src="<c:url value='/resources/js/jquery.js'/>"></script>

	<!-- Bootstrap Core JavaScript -->
	<script src="<c:url value='/resources/js/bootstrap.min.js'/>"></script>

	<!-- Morris Charts JavaScript -->
	<script
		src="<c:url value='/resources/js/plugins/morris/raphael.min.js'/>"></script>
	<script
		src="<c:url value='/resources/js/plugins/morris/morris.min.js'/>"></script>
	<script
		src="<c:url value='/resources/js/plugins/morris/morris-data.js'/>"></script>
</body>

</html>