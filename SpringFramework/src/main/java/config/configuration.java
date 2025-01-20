package config;
import org.example.Alien;
import org.example.Computer;
import org.example.DesktopCustom;
import org.example.Laptop;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("org.example")
public class configuration {

   /* This is managed by spring
    @Bean
    @Primary
    @Scope("singleton") //or prototype
    public DesktopCustom desktopCustom () {
        return new DesktopCustom();
    }

    @Bean
    @Qualifier("desktopCustom"), used when there multiple beans with same type
    public Alien alien(Computer com){
        Alien obj = new Alien();
        obj.setAge(25);
        obj.setCom(com);
        return  obj;
    }

    @Bean

    public Laptop laptop(){
        return new Laptop();
    }*/
}
