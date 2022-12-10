<input type="text" value="1" id="timer"><br>
<input type="submit" value="Прибавить единицу" onclick="start()"> 


function Timer(){ // функция таймера (подсчёт количества секунд)
   var elem = document.getElementById('timer');
   elem.value = parseInt(elem.value)+1;
}

function start() { // функция запуска
   window.setTimeout(Timer, 5000);
}
