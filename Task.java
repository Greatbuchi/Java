import java.time.LocalDate;

public class Task {
  private int id;
  private String name;
  private LocalDate starDate = LocalDate.now();
  private LocalDate enDate = LocalDate.now();
  private int priority;
  private boolean completed;

  public Task() {
  }

  public Task(int id, String name, int priority) {

    this(id, name, LocalDate.now(), LocalDate.now(), priority, false);

  }

  public Task(int id, String name, LocalDate starDate, LocalDate enDate, int priority, boolean completed) {
    this.id = id;
    this.name = name;
    this.starDate = starDate;
    this.enDate = enDate;
    this.priority = priority;
    this.completed = completed;
  }

}
