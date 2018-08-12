/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicando4;

/**
 *
 * @author Jorge
 */
public class Estudiante
{
        private String nombre;
        private String apellido;
        private String correo;

        public String getNombre()
        {
            //2º - Gestiona o recoge la variable que el setter ha definido.
            nombre = "[ " + nombre + " ]";    
            return nombre;
        }
        public void setNombre(String nombre)
        {
            //1º - Recibe un valor nombre que asigna a la variable de la clase (por mediodel this).
            this.nombre = nombre;
        }

        public String getApellido()
        {
                return apellido;
        }
        public void setApellido(String apellido)
        {
                this.apellido = apellido;
        }

        public String getCorreo()
        {
                return correo;
        }
        public void setCorreo(String correo)
        {
                this.correo = correo;
        }
}