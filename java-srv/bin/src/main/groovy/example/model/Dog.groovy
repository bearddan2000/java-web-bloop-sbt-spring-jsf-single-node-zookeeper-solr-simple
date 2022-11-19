package example.model;

import lombok.*;
import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.Indexed;
import org.springframework.data.solr.core.mapping.SolrDocument;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SolrDocument(solrCoreName = "dog")
public class Dog {
  @Id
  @Field
  private String id;

  @Field
  private String breed;

  @Field
  private String color;
}
