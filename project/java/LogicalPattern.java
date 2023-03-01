package None;

import java.util.List;
import lombok.*;



/* version: 1.1.0 */


/**
  A logical pattern is a grouping of characteristics unique to an informational pattern expressed via a structured pattern expression following the rules of logic.
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class LogicalPattern extends Pattern {

  private String patternExpression;

}