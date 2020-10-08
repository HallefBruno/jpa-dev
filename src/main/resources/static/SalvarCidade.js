$(document).ready(function () {

    let select = $(".custom-select");
    let idEstado;
    
    $.getJSON("estados/todos", function (result) {
        $.each(result, function (item) {
            select.append($('<option></option>').val(result[item].id).text(result[item].nome)); 
        });
    });
    
    select.on('change',function () {
        idEstado = $(this).val();
    });

    
    $("#salvarCidade").on("click", function () {

        let cidade = {
            nome:$("#nome").val(),
            estado: {
                id:idEstado
            }
        };
        
        $.ajax({
            url: "cidades/salvar",
            type: 'POST',
            dataType: "json",
            data: JSON.stringify(cidade),
            contentType: "application/json",
            success: function (data, textStatus, jqXHR) {
                if(data) {
                    alert("Registro salvo com sucesso!");
                }
            },
            error: function (jqXHR, textStatus, errorThrown) {
                alert("Algo deu errado!");
                console.log(jqXHR);
            }
            
        });
        
//        $.post("cidades/salvar", {cidade},
//            function (msg) {
//                $("#resultado").html(msg);
//            }).fail(function () {
//                alert("error");
//        });
        
    });

});