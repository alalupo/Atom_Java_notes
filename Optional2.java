import java.utils.Optional;

public class App {
  public Optional<Integer> findElement(Integer[] arr, int x) {
    return Arrays.stream(arr).filter(num -> num == x).findFirst();
  }
}
