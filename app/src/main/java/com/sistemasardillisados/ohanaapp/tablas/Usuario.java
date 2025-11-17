package com.sistemasardillisados.ohanaapp.tablas;
public class Usuario {
    public int ID;
    public String NOMBRE_S;
    public String AP_PATERNO;
    public String AP_MATERNO;
    public String TELEFONO;
    public String PRODUCTOS_COMPRADOS;
    public String ROL_USUARIO;

    //★Id
    public int GetId() {
        return this.ID;
    }

    public void SetId(int ID) {
        this.ID = ID;
    }

    //★Nombre_S
    public String GetNombre_S() {
        return this.NOMBRE_S;
    }

    public void SetNombre_S(String NOMBRE_S) {
        this.NOMBRE_S = NOMBRE_S;
    }

    //★Ap_Paterno
    public String GetAp_Paterno() {
        return this.AP_PATERNO;
    }
    public void SetAp_Paterno(String AP_PATERNO) {
        this.AP_PATERNO = AP_PATERNO;
    }
    //★Ap_Materno
    public String GetAp_Materno() {
        return this.AP_MATERNO;
    }
    public void setAp_Materno(String AP_MATERNO) {
        this.AP_MATERNO = AP_MATERNO;
    }
    //★Telefono
    public String GetTelefono() {
        return this.TELEFONO;
    }
    public void SetTelefono(String TELEFONO) {
        this.TELEFONO = TELEFONO;
    }
    //★Productos_Comprados
    public String GetProductos_Comprados() {
        return this.PRODUCTOS_COMPRADOS;
    }
    public void SetProductos_Comprados(String PRODUCTOS_COMPRADOS) {
        this.PRODUCTOS_COMPRADOS=PRODUCTOS_COMPRADOS;
    }
    //★Rol_Usuario
    public String GetRol_Usuario() {
        return this.ROL_USUARIO;
    }
    public void SetRol_Usuario(String ROL_USUARIO) {
        this.ROL_USUARIO = ROL_USUARIO;
    }
}