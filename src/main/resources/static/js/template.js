var puesto = document.getElementById("puestos");
var modalidad = document.getElementById("modalidad");


if(modalidad != null) {
	modalidad.addEventListener("click", function() {
	    if (modalidad.value ==1) {
       alert('yes');
	        setTimeout(() => {}, 300);
	    } else {
	        alert('No');
	    }
	});
}

if(puesto != null) {
	puesto.addEventListener("click", function() {
	    if (puesto.innerText == "Mostrar") {
	        document.getElementById("listado-puestos").setAttribute("class", "listado-puestos-mostrar");
	        puesto.innerHTML = "Ocultar";
	        setTimeout(() => {}, 300);
	    } else {
	        document.getElementById("listado-puestos").setAttribute("class", "listado-puestos");
	        puesto.innerHTML = "Mostrar";
	    }
	});
}



function googleTranslateElementInit() {
       new google.translate.TranslateElement({ pageLanguage: 'en' }, 'google_translate_element');
   }
    
var flags = document.getElementsByClassName('flag_link');
Array.prototype.forEach.call(flags, function(e){
  e.addEventListener('click', function(){
    var lang = e.getAttribute('data-lang'); 
    var languageSelect = document.querySelector("select.goog-te-combo");    
    languageSelect.value = lang; 
    languageSelect.dispatchEvent(new Event("change"));
  }); 
});
        



