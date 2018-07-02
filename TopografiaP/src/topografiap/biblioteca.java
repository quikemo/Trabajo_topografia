package topografiap;

import java.sql.ResultSet;

public class biblioteca {

    //instanciar un objeto de tipo Conexion
    Conexion cn = new Conexion();
    
    //BD archivo
    public void insertararchivo(String idArchivo, String nomArchivo, String fecha) {
        cn.UID("INSERT INTO archivo(id_archivo,nom_archivo,fecha_creacion) VALUES('" + idArchivo + "','" + nomArchivo + "','" + fecha +"')");
    }
    
    // BD datos generales
    public void insertardatosgenerales(String arhivoid, String vertices, String azimut, String tangular, String vista, String mojon, String longitud, String latitud, String iddatos) {
        cn.UID("INSERT INTO datos_generales(arhivo_id,vertices,azimut,tolerancia_angular,vista,mojon,longitud,latitud,id_datos) VALUES('" + arhivoid + "','" + vertices + "','" + azimut + "','" + tangular + "','" + vista + "','" + mojon + "','" + longitud + "','" + latitud +"','" + iddatos +"')");
    }
    
    //BD vertices
    public void insertarvertices(String verticetam, String codvertice, String numvertice) {
        cn.UID("INSERT INTO vertice(vertices_tam,cod_vertice,num_vertice) VALUES('" + verticetam + "','" + codvertice + "','" + numvertice +"')");
    }
    
    //bd poligono base
    public void insertarpoligonobase(String cod_vertices, String lectura1, String lectura2, String lectura3, String lectura4, String distaciaXestacion) {
        cn.UID("INSERT INTO poligono_base(cod_vertices,lectura1,lectura2,lectura3,lectura4,distaciaXestacion) VALUES('" + cod_vertices + "','" + lectura1 + "','" + lectura2 + "','" + lectura3 + "','" + lectura4 +"','" + distaciaXestacion +"')");
    }                                                                                                                                                                                                                           
                                                                                                                                                                                                      
    //bd mojones
    public void insertarmojones(String mojon, String num_verticenum, String distaciaXmojon, String lectura1, String vistaXmojon) {
        cn.UID("INSERT INTO mojones(mojon,num_verticenum,distaciaXmojon,lectura1,vistaXmojon) VALUES('" + mojon + "','" + num_verticenum + "','" + distaciaXmojon + "','" + lectura1 +"','" + vistaXmojon +"')");
    }

}
