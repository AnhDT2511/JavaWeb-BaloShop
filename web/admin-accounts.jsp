<%-- 
    Document   : admin-dashboard
    Created on : Oct 21, 2018, 11:36:18 PM
    Author     : Shado
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<div class="right-side mb-5">
    <div class="row title">
        <div class="col-md-12">
            <h6>
                Quản lý tài khoản
            </h6>
        </div>
    </div>

    <div class="row mt-2">
        <div class="col-md-12">
            <table id="accounts" table class="table table-bordered" cellspacing="0" width="100%">
                <thead>
                    <tr>
                        <th>STT</th>
                        <th>Email</th>
                        <th>Loại</th>
                        <th>Trạng thái</th>
                        <th>Chi tiết</th>
                        <th>Chức năng</th>
                    </tr>
                </thead>
                <tbody>
                <c:forEach items="${accounts}" var="i" varStatus="no">
                    <tr>
                        <td>${no.index+1}</td>
                        <td>${i.email}</td>
                        <td>${i.roleId == 1 ? "Admin" : "Khách hàng"}</td>
                        <td>${i.status == 1 ? "Đang hoạt động" : "Ngừng hoạt động"}</td>
                        <td>
                            <a href="#" data-toggle="modal" data-target="#myModal" class="g-color">Chi tiết</a>
<!--                            <a href="#no${no.index+1}" data-toggle="collapse" class="g-color">Chi tiết</a> -->
                        </td>
                        <td>
                            <a href="" class="mr-3">Sửa</a>
                            <a href="">Khóa</a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>

<!-- The Modal -->
<div class="modal fade" id="myModal">
    <div class="modal-dialog modal-lg">
        <div class="modal-content">

            <!-- Modal Header -->
            <div class="modal-header">
                <h5 class="modal-title">Chi tiết tài khoản</h5>
                <button type="button" class="close" data-dismiss="modal">&times;</button>
            </div>

            <!-- Modal body -->
            <div class="modal-body result-detail">
                xxxxxxxxxxxxxxxxxxxxx
            </div>

            <!-- Modal footer -->
            <div class="modal-footer">
                <button type="submit" class="btn btn-success" data-dismiss="modal">Cập nhật thông tin</button>
                <button type="button" class="btn btn-danger" data-dismiss="modal">Đóng</button>
            </div>

        </div>
    </div>
</div>

