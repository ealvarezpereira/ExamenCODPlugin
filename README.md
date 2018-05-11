# ExamenCODPlugin
Examen 2 de contornos, proyecto plugin

1.- Creamos el modulo

2.- Configuramos el modulo siguiendo este tutorial: https://platform.netbeans.org/tutorials/nbm-google.html

3.- Escribimos el codigo ejemplo de este tutorial: https://www.linglom.com/programming/java/how-to-run-command-line-or-execute-external-application-from-java/

4.- El comando a ejecutar es este: 

  javapackager -deploy -native deb 
  -Bcategory=<categoria.> -outdir <direccionguardado.> -outfile <nombre.> 
  -srcdir <direcionjar.> -srcfiles <archivo.jar> 
  -appclass <clase.> 
  -name <nombre.> -title <titulo.>
  
  
5.- Una vez todo escrito hacemos click derecho en el modulo y pulsamos en Install/Reload in developement IDE

6.- Escribimos todos los parametros que te pide y al terminar se queda NetBeans colgado. Si se queda colgado, no pasa nada, es síntoma de que funciona.

7.- Una vez vuelve a la vida comprobamos que ha creado todo

8.- Finalmente hacemos click derecho en el modulo y le damos a create NBM
