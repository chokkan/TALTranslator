//
// Generated by JTB 1.3.2
//

package parser.syntaxtree;

/**
 * Grammar production:
 * f0 -> terminal()
 *       | <LPAR> fof() <RPAR>
 *       | <LBRACK> fof() <RBRACK>
 */
public class atom implements Node {
   public NodeChoice f0;

   public atom(NodeChoice n0) {
      f0 = n0;
   }

   public void accept(parser.visitor.Visitor v) {
      v.visit(this);
   }
   public <R,A> R accept(parser.visitor.GJVisitor<R,A> v, A argu) {
      return v.visit(this,argu);
   }
   public <R> R accept(parser.visitor.GJNoArguVisitor<R> v) {
      return v.visit(this);
   }
   public <A> void accept(parser.visitor.GJVoidVisitor<A> v, A argu) {
      v.visit(this,argu);
   }
}

