$(document).ready(function () {

    let select = $(".custom-select");
    let idCidade;
    
    $.getJSON("bairros/cidades/todas", function (result) {
        $.each(result, function (item) {
            select.append($('<option></option>').val(result[item].id).text(result[item].nome)); 
        });
    });
    
    select.on('change',function () {
        idCidade = $(this).val();
    });

    $("#salvarBairro").on("click", function () {

        let bairro = {
            nome:$("#nome").val(),
            cidade: {
                id:idCidade
            }
        };
        
        $.ajax({
            url: "bairros/salvar",
            type: 'POST',
            dataType: "json",
            data: JSON.stringify(bairro),
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