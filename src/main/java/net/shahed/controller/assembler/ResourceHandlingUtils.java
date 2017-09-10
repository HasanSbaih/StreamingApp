package net.shahed.controller.assembler;

import net.shahed.business.bean.Product;
import net.shahed.controller.resource.ResourceNotFoundException;

public abstract class ResourceHandlingUtils {

   public static <T extends Product> T entityOrNotFoundException(T entity) {
      if ( entity == null  ) {
         throw new ResourceNotFoundException();
      }
      return entity;
   }
}
