$(document).ready(function () {

    let select = $(".custom-select");
    $.getJSON("estados/todos", function (result) {
        $.each(result, function (item) {
            select.append($('<option></option>').val(result[item].id).text(result[item].nome)); 
        });
    });
    
    select.on('change',function (event) {
        console.log(event);
    });
    
    $("#salvarCidade").on("click", function () {
        console.log(select);
        
//        let cidade = {
//            estado: {
//                id:
//            }
//        };
        
    });

});