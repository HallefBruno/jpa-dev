$(document).ready(function  (){
    
    $("#salvarEstado").on("click",function () {
        
        let estado = {
            'nome':$("#nome").val()
        };
        
        $.ajax({
            url: "estados/salvar",
            type: 'POST',
            dataType: "json",
            data: JSON.stringify(estado),
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
        
    });
    
});

