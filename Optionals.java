import java.utils.Optional;

public class App {
  public Integer findElement(Integer[] arr, int x) {
    for(Integer num : arr) {
      if(num == x) {
        return x;
      }
    }
    return null;
  }
}
