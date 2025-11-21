package ai.bitki.orchestration.common.dto;

import jakarta.validation.constraints.NotNull;

public class Component {

  @NotNull(message = "Id must not be null")
  protected final String id;

  protected final long createdAt;
  protected final long updatedAt;

  public Component(String id, long createdAt, long updatedAt) {
    this.id = id;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
  }

  public String getId() {
    return this.id;
  }

  public long getCreatedAt() {
    return this.createdAt;
  }

  public long getUpdatedAt() {
    return this.updatedAt;
  }
}
