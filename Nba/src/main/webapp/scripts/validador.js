/**
 * Validação de formulário
 */

 function validar(){
	 let nome = frmTime.nome.value;
	 
	 let mvp = frmTime.mvp.value;
	 let mvpClass = frmTime.mvpClass.value;
	 let mvpNac = frmTime.mvpNac.value;
	 
	 let star = frmTime.star.value;
	 let starClass = frmTime.starClass.value;
	 let starNac = frmTime.starNac.value;
	 
	 if(nome === ""|| isFinite(nome)){
		 alert('Preencha o campo "Nome" corretamente.');
		 frmTime.nome.focus();
		 return false;
	 } else if(mvp === ""|| isFinite(mvp)){
		 alert('Preencha o campo "MVP da Franquia" corretamente.');
		 frmTime.mvp.focus();
		 return false;
	 } else if(mvpClass === ""){
		 alert('Preencha o campo "Classe do Draft"');
		 frmTime.mvpClass.focus();
		 return false;
	} else if(mvpNac === ""){
		 alert('Preencha o campo "Nacionalidade"');
		 frmTime.mvpNac.focus();
		 return false;
	} else if(star === ""|| isFinite(star)){
		 alert('Preencha o campo "Estrela da Franquia" corretamente.');
		 frmTime.star.focus();
		 return false;
	} else if(starClass === ""){
		 alert('Preencha o campo "Classe do Draft"');
		 frmTime.starClass.focus();
		 return false;
	} else if(starNac === ""){
		 alert('Preencha o campo "Nacionalidad"');
		 frmTime.starNac.focus();
		 return false;
	} else {
		document.forms["frmTime"].submit();
	}
}
 