var puesto = document.getElementById("puestos");
var procedimiento = document.getElementById("procedimientos");
var formato = document.getElementById("formatos");
var vfraccion1 = document.getElementById("fraccion1");
var vfraccion2 = document.getElementById("fraccion2");
var vfraccion3 = document.getElementById("fraccion3");
var vfraccion6 = document.getElementById("fraccion6");
var vfraccion9 = document.getElementById("fraccion9");
var vfraccion12 = document.getElementById("fraccion12");
var vfraccion17 = document.getElementById("fraccion17");
var vfraccion18 = document.getElementById("fraccion18");
var vfraccion20 = document.getElementById("fraccion20");
var vfraccion21 = document.getElementById("fraccion21");
var vfraccion22 = document.getElementById("fraccion22");
var vfraccion24 = document.getElementById("fraccion24");
var vfraccion25 = document.getElementById("fraccion25");
var vfraccion29 = document.getElementById("fraccion29");
var vfraccion31 = document.getElementById("fraccion31");
var vfraccion33 = document.getElementById("fraccion33");
var vfraccion34 = document.getElementById("fraccion34");
var vfraccion43 = document.getElementById("fraccion43");
var vfraccion44 = document.getElementById("fraccion44");
var vpresupuestoA = document.getElementById("presupuestoA");
var vpresupuestoB = document.getElementById("presupuestoB");
var vpresupuestoC = document.getElementById("presupuestoC");
var primerTrimestre = document.getElementById("primer-trimestre");
var segundoTrimestre = document.getElementById("segundo-trimestre");
var tercerTrimestre = document.getElementById("tercer-trimestre");
var cuartoTrimestre = document.getElementById("cuarto-trimestre");



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

if(procedimiento != null) {
	procedimiento.addEventListener("click", function() {
	    if (procedimiento.innerText == "Mostrar") {
	        document.getElementById("listado-procedimientos").setAttribute("class", "listado-procedimientos-mostrar");
	        procedimiento.innerHTML = "Ocultar";
	    } else {
	        document.getElementById("listado-procedimientos").setAttribute("class", "listado-procedimientos");
	        procedimiento.innerHTML = "Mostrar";
	    }
	});
}

if(formato != null) {
	formato.addEventListener("click", function() {
	    if (formato.innerText == "Mostrar") {
	        document.getElementById("listado-formatos").setAttribute("class", "listado-formatos-mostrar");
	        formato.innerHTML = "Ocultar";
	    } else {
	        document.getElementById("listado-formatos").setAttribute("class", "listado-formatos");
	        formato.innerHTML = "Mostrar";
	    }
	});
}

if(vfraccion1 != null) {
	vfraccion1.addEventListener("click", function() {
	    if (vfraccion1.innerText == "Mostrar") {
	        document.getElementById("listado-fraccion1").setAttribute("class", "listado-fraccion1-mostrar");
	        vfraccion1.innerHTML = "Ocultar";
	    } else {
	        document.getElementById("listado-fraccion1").setAttribute("class", "listado-fraccion1");
	        vfraccion1.innerHTML = "Mostrar";
	    }
	});
}

if(vfraccion2 != null) {
	vfraccion2.addEventListener("click", function() {
	    if (vfraccion2.innerText == "Mostrar") {
	        document.getElementById("listado-fraccion2").setAttribute("class", "listado-fraccion2-mostrar");
	        vfraccion2.innerHTML = "Ocultar";
	    } else {
	        document.getElementById("listado-fraccion2").setAttribute("class", "listado-fraccion2");
	        vfraccion2.innerHTML = "Mostrar";
	    }
	});
}
if(vfraccion3 != null) {
	vfraccion3.addEventListener("click", function() {
	    if (vfraccion3.innerText == "Mostrar") {
	        document.getElementById("listado-fraccion3").setAttribute("class", "listado-fraccion3-mostrar");
	        vfraccion3.innerHTML = "Ocultar";
	    } else {
	        document.getElementById("listado-fraccion3").setAttribute("class", "listado-fraccion3");
	        vfraccion3.innerHTML = "Mostrar";
	    }
	});
}
if(vfraccion6 != null) {
	vfraccion6.addEventListener("click", function() {
	    if (vfraccion6.innerText == "Mostrar") {
	        document.getElementById("listado-fraccion6").setAttribute("class", "listado-fraccion6-mostrar");
	        vfraccion6.innerHTML = "Ocultar";
	    } else {
	        document.getElementById("listado-fraccion6").setAttribute("class", "listado-fraccion6");
	        vfraccion6.innerHTML = "Mostrar";
	    }
	});
}
if(vfraccion9 != null) {
	vfraccion9.addEventListener("click", function() {
	    if (vfraccion9.innerText == "Mostrar") {
	        document.getElementById("listado-fraccion9").setAttribute("class", "listado-fraccion9-mostrar");
	        vfraccion9.innerHTML = "Ocultar";
	    } else {
	        document.getElementById("listado-fraccion9").setAttribute("class", "listado-fraccion9");
	        vfraccion9.innerHTML = "Mostrar";
	    }
	});
}

if(vfraccion12 != null) {
	vfraccion12.addEventListener("click", function() {
	    if (vfraccion12.innerText == "Mostrar") {
	        document.getElementById("listado-fraccion12").setAttribute("class", "listado-fraccion12-mostrar");
	        vfraccion12.innerHTML = "Ocultar";
	    } else {
	        document.getElementById("listado-fraccion12").setAttribute("class", "listado-fraccion12");
	        vfraccion12.innerHTML = "Mostrar";
	    }
	});
}
if(vfraccion17 != null) {
	vfraccion17.addEventListener("click", function() {
	    if (vfraccion17.innerText == "Mostrar") {
	        document.getElementById("listado-fraccion17").setAttribute("class", "listado-fraccion17-mostrar");
	        vfraccion17.innerHTML = "Ocultar";
	    } else {
	        document.getElementById("listado-fraccion17").setAttribute("class", "listado-fraccion17");
	        vfraccion17.innerHTML = "Mostrar";
	    }
	});
}

if(vfraccion18 != null) {
	vfraccion18.addEventListener("click", function() {
	    if (vfraccion18.innerText == "Mostrar") {
	        document.getElementById("listado-fraccion18").setAttribute("class", "listado-fraccion18-mostrar");
	        vfraccion18.innerHTML = "Ocultar";
	    } else {
	        document.getElementById("listado-fraccion18").setAttribute("class", "listado-fraccion18");
	        vfraccion18.innerHTML = "Mostrar";
	    }
	});
}

if(vfraccion20 != null) {
	vfraccion20.addEventListener("click", function() {
	    if (vfraccion20.innerText == "Mostrar") {
	        document.getElementById("listado-fraccion20").setAttribute("class", "listado-fraccion20-mostrar");
	        vfraccion20.innerHTML = "Ocultar";
	    } else {
	        document.getElementById("listado-fraccion20").setAttribute("class", "listado-fraccion20");
	        vfraccion20.innerHTML = "Mostrar";
	    }
	});
}

if(vfraccion21 != null) {
	vfraccion21.addEventListener("click", function() {
	    if (vfraccion21.innerText == "Mostrar") {
	        document.getElementById("listado-fraccion21").setAttribute("class", "listado-fraccion21-mostrar");
	        vfraccion21.innerHTML = "Ocultar";
	    } else {
	        document.getElementById("listado-fraccion21").setAttribute("class", "listado-fraccion21");
	        vfraccion21.innerHTML = "Mostrar";
	    }
	});
}

if(vfraccion22 != null) {
	vfraccion22.addEventListener("click", function() {
	    if (vfraccion22.innerText == "Mostrar") {
	        document.getElementById("listado-fraccion22").setAttribute("class", "listado-fraccion22-mostrar");
	        vfraccion22.innerHTML = "Ocultar";
	    } else {
	        document.getElementById("listado-fraccion22").setAttribute("class", "listado-fraccion22");
	        vfraccion22.innerHTML = "Mostrar";
	    }
	});
}

if(vfraccion24 != null) {
	vfraccion24.addEventListener("click", function() {
	    if (vfraccion24.innerText == "Mostrar") {
	        document.getElementById("listado-fraccion24").setAttribute("class", "listado-fraccion24-mostrar");
	        vfraccion24.innerHTML = "Ocultar";
	    } else {
	        document.getElementById("listado-fraccion24").setAttribute("class", "listado-fraccion24");
	        vfraccion24.innerHTML = "Mostrar";
	    }
	});
}

if(vfraccion25 != null) {
	vfraccion25.addEventListener("click", function() {
	    if (vfraccion25.innerText == "Mostrar") {
	        document.getElementById("listado-fraccion25").setAttribute("class", "listado-fraccion25-mostrar");
	        vfraccion25.innerHTML = "Ocultar";
	    } else {
	        document.getElementById("listado-fraccion25").setAttribute("class", "listado-fraccion25");
	        vfraccion25.innerHTML = "Mostrar";
	    }
	});
}


if(vfraccion29 != null) {
	vfraccion29.addEventListener("click", function() {
	    if (vfraccion29.innerText == "Mostrar") {
	        document.getElementById("listado-fraccion29").setAttribute("class", "listado-fraccion29-mostrar");
	        vfraccion29.innerHTML = "Ocultar";
	    } else {
	        document.getElementById("listado-fraccion29").setAttribute("class", "listado-fraccion29");
	        vfraccion29.innerHTML = "Mostrar";
	    }
	});
}

if(vfraccion31 != null) {
	vfraccion31.addEventListener("click", function() {
	    if (vfraccion31.innerText == "Mostrar") {
	        document.getElementById("listado-fraccion31").setAttribute("class", "listado-fraccion31-mostrar");
	        vfraccion31.innerHTML = "Ocultar";
	    } else {
	        document.getElementById("listado-fraccion31").setAttribute("class", "listado-fraccion31");
	        vfraccion31.innerHTML = "Mostrar";
	    }
	});
}

if(vfraccion33 != null) {
	vfraccion33.addEventListener("click", function() {
	    if (vfraccion33.innerText == "Mostrar") {
	        document.getElementById("listado-fraccion33").setAttribute("class", "listado-fraccion33-mostrar");
	        vfraccion33.innerHTML = "Ocultar";
	    } else {
	        document.getElementById("listado-fraccion33").setAttribute("class", "listado-fraccion33");
	        vfraccion33.innerHTML = "Mostrar";
	    }
	});
}

if(vfraccion34 != null) {
	vfraccion34.addEventListener("click", function() {
	    if (vfraccion34.innerText == "Mostrar") {
	        document.getElementById("listado-fraccion34").setAttribute("class", "listado-fraccion34-mostrar");
	        vfraccion34.innerHTML = "Ocultar";
	    } else {
	        document.getElementById("listado-fraccion34").setAttribute("class", "listado-fraccion34");
	        vfraccion34.innerHTML = "Mostrar";
	    }
	});
}

if(vfraccion43 != null) {
	vfraccion43.addEventListener("click", function() {
	    if (vfraccion43.innerText == "Mostrar") {
	        document.getElementById("listado-fraccion43").setAttribute("class", "listado-fraccion43-mostrar");
	        vfraccion43.innerHTML = "Ocultar";
	    } else {
	        document.getElementById("listado-fraccion43").setAttribute("class", "listado-fraccion43");
	        vfraccion43.innerHTML = "Mostrar";
	    }
	});
}


if(vfraccion44 != null) {
	vfraccion44.addEventListener("click", function() {
	    if (vfraccion44.innerText == "Mostrar") {
	        document.getElementById("listado-fraccion44").setAttribute("class", "listado-fraccion44-mostrar");
	        vfraccion44.innerHTML = "Ocultar";
	    } else {
	        document.getElementById("listado-fraccion44").setAttribute("class", "listado-fraccion44");
	        vfraccion44.innerHTML = "Mostrar";
	    }
	});
}

if(vpresupuestoA != null) {
	vpresupuestoA.addEventListener("click", function() {
	    if (vpresupuestoA.innerText == "Mostrar") {
	        document.getElementById("listado-presupuestoA").setAttribute("class", "listado-presupuestoA-mostrar");
	        vpresupuestoA.innerHTML = "Ocultar";
	    } else {
	        document.getElementById("listado-presupuestoA").setAttribute("class", "listado-presupuestoA");
	        vpresupuestoA.innerHTML = "Mostrar";
	    }
	});
}

if(vpresupuestoB != null) {
	vpresupuestoB.addEventListener("click", function() {
	    if (vpresupuestoB.innerText == "Mostrar") {
	        document.getElementById("listado-presupuestoB").setAttribute("class", "listado-presupuestoB-mostrar");
	        vpresupuestoB.innerHTML = "Ocultar";
	    } else {
	        document.getElementById("listado-presupuestoB").setAttribute("class", "listado-presupuestoB");
	        vpresupuestoB.innerHTML = "Mostrar";
	    }
	});
}

if(vpresupuestoC != null) {
	vpresupuestoC.addEventListener("click", function() {
	    if (vpresupuestoC.innerText == "Mostrar") {
	        document.getElementById("listado-presupuestoC").setAttribute("class", "listado-presupuestoC-mostrar");
	        vpresupuestoC.innerHTML = "Ocultar";
	    } else {
	        document.getElementById("listado-presupuestoC").setAttribute("class", "listado-presupuestoC");
	        vpresupuestoC.innerHTML = "Mostrar";
	    }
	});
}

if(primerTrimestre != null) {
	primerTrimestre.addEventListener("click", function() {
	    if (primerTrimestre.innerText == "Mostrar") {
	        document.getElementById("tabla-primer-trimestre").classList.add("tabla-primer-trimestre-mostrar");
	        primerTrimestre.innerHTML = "Ocultar";
	        setTimeout(() => {}, 300);
	    } else {
	        document.getElementById("tabla-primer-trimestre").classList.remove("tabla-primer-trimestre-mostrar");
	       primerTrimestre.innerHTML = "Mostrar";
	    }
	});
}

if(segundoTrimestre != null) {
	segundoTrimestre.addEventListener("click", function() {
	    if (segundoTrimestre.innerText == "Mostrar") {
	        document.getElementById("tabla-segundo-trimestre").classList.add("tabla-segundo-trimestre-mostrar");
	        segundoTrimestre.innerHTML = "Ocultar";
	        setTimeout(() => {}, 300);
	    } else {
	        document.getElementById("tabla-segundo-trimestre").classList.remove("tabla-segundo-trimestre-mostrar");
	       segundoTrimestre.innerHTML = "Mostrar";
	    }
	});
}

if(tercerTrimestre != null) {
	tercerTrimestre.addEventListener("click", function() {
	    if (tercerTrimestre.innerText == "Mostrar") {
	        document.getElementById("tabla-tercer-trimestre").classList.add("tabla-tercer-trimestre-mostrar");
	        tercerTrimestre.innerHTML = "Ocultar";
	        setTimeout(() => {}, 300);
	    } else {
	        document.getElementById("tabla-tercer-trimestre").classList.remove("tabla-tercer-trimestre-mostrar");
	       tercerTrimestre.innerHTML = "Mostrar";
	    }
	});
}

if(cuartoTrimestre != null) {
	cuartoTrimestre.addEventListener("click", function() {
	    if (cuartoTrimestre.innerText == "Mostrar") {
	        document.getElementById("tabla-cuarto-trimestre").classList.add("tabla-cuarto-trimestre-mostrar");
	        cuartoTrimestre.innerHTML = "Ocultar";
	        setTimeout(() => {}, 300);
	    } else {
	        document.getElementById("tabla-cuarto-trimestre").classList.remove("tabla-cuarto-trimestre-mostrar");
	       cuartoTrimestre.innerHTML = "Mostrar";
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
        



