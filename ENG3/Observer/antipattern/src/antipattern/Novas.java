package antipattern;

import java.util.ArrayList;
import java.util.List;

public class Novas {
   List<Calculo> calculos = new ArrayList<>();
   private int state;

   public int getState() {
      return state;
   }

   public void setState(int state) {
      this.state = state;
   }

   public void add(Calculo calculo) {
      calculos.add(calculo);
   }

   public void notificarTodos() {
      for (Calculo calculo : calculos) {
         calculo.update(state);
      }
   }
}
