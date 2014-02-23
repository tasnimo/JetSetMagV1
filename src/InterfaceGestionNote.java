/***********************************************************************
 * Module:  InterfaceGestionNote.java
 * Author:  tasnim
 * Purpose: Defines the Class InterfaceGestionNote
 ***********************************************************************/

import java.util.*;

/** @pdOid 47da9392-beff-47b6-88ff-0e85160a3a3b */
public class InterfaceGestionNote {
   /** @pdRoleInfo migr=no name=InterfaceAccueilAdmin assc=association21 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<InterfaceAccueilAdmin> interfaceAccueilAdmin;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<InterfaceAccueilAdmin> getInterfaceAccueilAdmin() {
      if (interfaceAccueilAdmin == null)
         interfaceAccueilAdmin = new java.util.HashSet<InterfaceAccueilAdmin>();
      return interfaceAccueilAdmin;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorInterfaceAccueilAdmin() {
      if (interfaceAccueilAdmin == null)
         interfaceAccueilAdmin = new java.util.HashSet<InterfaceAccueilAdmin>();
      return interfaceAccueilAdmin.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newInterfaceAccueilAdmin */
   public void setInterfaceAccueilAdmin(java.util.Collection<InterfaceAccueilAdmin> newInterfaceAccueilAdmin) {
      removeAllInterfaceAccueilAdmin();
      for (java.util.Iterator iter = newInterfaceAccueilAdmin.iterator(); iter.hasNext();)
         addInterfaceAccueilAdmin((InterfaceAccueilAdmin)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newInterfaceAccueilAdmin */
   public void addInterfaceAccueilAdmin(InterfaceAccueilAdmin newInterfaceAccueilAdmin) {
      if (newInterfaceAccueilAdmin == null)
         return;
      if (this.interfaceAccueilAdmin == null)
         this.interfaceAccueilAdmin = new java.util.HashSet<InterfaceAccueilAdmin>();
      if (!this.interfaceAccueilAdmin.contains(newInterfaceAccueilAdmin))
         this.interfaceAccueilAdmin.add(newInterfaceAccueilAdmin);
   }
   
   /** @pdGenerated default remove
     * @param oldInterfaceAccueilAdmin */
   public void removeInterfaceAccueilAdmin(InterfaceAccueilAdmin oldInterfaceAccueilAdmin) {
      if (oldInterfaceAccueilAdmin == null)
         return;
      if (this.interfaceAccueilAdmin != null)
         if (this.interfaceAccueilAdmin.contains(oldInterfaceAccueilAdmin))
            this.interfaceAccueilAdmin.remove(oldInterfaceAccueilAdmin);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllInterfaceAccueilAdmin() {
      if (interfaceAccueilAdmin != null)
         interfaceAccueilAdmin.clear();
   }

}