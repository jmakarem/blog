package blog.jadmak.code.utils;

public class RunUtils {

  /**
   * Executes a {@code Runnable} and returns the execution time in milliseconds.
   *
   * <p>This method measures the time taken for the provided {@code Runnable} to execute. It records
   * the start time before running the task, records the end time after the task completes, and then
   * calculates and returns the elapsed time in milliseconds.
   *
   * @param runnable The {@code Runnable} task to be executed.
   * @return The execution time of the task in milliseconds.
   * @throws NullPointerException If {@code runnable} is {@code null}.
   */
  public static long runAndGetExecutionTime(Runnable runnable) {
    long startTime = System.nanoTime();

    runnable.run();

    long endTime = System.nanoTime();
    return (endTime - startTime) / 1000000;
  }
}
