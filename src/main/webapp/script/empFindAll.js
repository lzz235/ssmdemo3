$(function () {
    findAll();
})
function findAll() {
    //1.获取请求参数
    alert("123");
    //2.参数格式校验
    //3.返送Ajax
    $.ajax({
        url: "http://localhost:8080/findAll.do",
        type: "post",
        success: function (result) {
            if (result.status == 0){
                var emps = result.data;
                for(var i=0; i<emps.length; i++){
                    var tr = '';
                    tr += '<tr>';
                    tr += '<td>'+emps[i].id+'</td>';
                    tr += '<td>'+emps[i].name+'</td>';
                    tr += '<td>'+emps[i].job+'</td>';
                    tr += '<td>'+emps[i].sal+'</td>';
                    tr += '<td>'+emps[i].deptno+'</td>';
                    tr += '</tr>';
                    var $tr = $(tr);
                    $("tbody").append($tr);
                }
            }
        },
        error: function () {
            alert("查询员工信息异常");
        }
    })
}