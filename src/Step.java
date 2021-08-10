public interface Step {
    String informationalLog(String description);
    String errorLog(String description);
    String debugLog(String description);
}
