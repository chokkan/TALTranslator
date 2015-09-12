//
// Generated by JTB 1.3.2
//

package parser.syntaxtree;

/**
 * Grammar production:
 * f0 -> implication()
 * f1 -> ( <EQUIV> implication() )*
 */
public class fof implements Node {
   public implication f0;
   public NodeListOptional f1;

   public fof(implication n0, NodeListOptional n1) {
      f0 = n0;
      f1 = n1;
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

