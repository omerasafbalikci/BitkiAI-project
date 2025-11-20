package ai.bitki.orchestration.common.dto;

import org.springframework.util.Assert;

public class Component {

  protected final String id;
  protected final long createdAt;
  protected final long updatedAt;

  public Component(String id, long createdAt, long updatedAt) {
    Assert.notNull(id, "Id must not be null");
    Assert.notNull(createdAt, "Created at must not be null");
    Assert.notNull(updatedAt, "Updated at must not be null");
    this.id = id;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
  }

  public String getId() {
    return id;
  }

  public long getCreatedAt() {
    return createdAt;
  }

  public long getUpdatedAt() {
    return updatedAt;
  }
}
