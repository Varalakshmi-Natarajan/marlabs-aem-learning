package com.adobe.aem.guides.marlabs.core.models.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.lenient;
import static org.mockito.Mockito.when;

import java.util.List;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.factory.ModelFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;

import com.adobe.aem.guides.marlabs.core.models.Byline;
import com.adobe.cq.wcm.core.components.models.Image;
import com.google.common.collect.ImmutableList;

import io.wcm.testing.mock.aem.junit5.AemContext;
import io.wcm.testing.mock.aem.junit5.AemContextExtension;

@ExtendWith(AemContextExtension.class)

public class BylineImplTest {

	private final AemContext ctx = new AemContext(); 
	
	@Mock
    private Image image;

    @Mock
    private ModelFactory modelFactory;
	
    @BeforeEach
    public void setUp() throws Exception {
        ctx.addModelsForClasses(BylineImpl.class);
        ctx.load().json("/com/adobe/aem/guides/marlabs/core/models/impl/BylineImplTest.json", "/content");
        
        lenient().when(modelFactory.getModelFromWrappedRequest(eq(ctx.request()), any(Resource.class), eq(Image.class)))
        .thenReturn(image);

      ctx.registerService(ModelFactory.class, modelFactory, org.osgi.framework.Constants.SERVICE_RANKING,
        Integer.MAX_VALUE);
    }

	/*
	 * @Test public void testGetName() { final String expected = "Jane Doe";
	 * 
	 * ctx.currentResource("/content/byline"); Byline byline =
	 * ctx.request().adaptTo(Byline.class);
	 * 
	 * String actual = byline.getName();
	 * 
	 * assertEquals(expected, actual); }
	 * 
	 * @Test public void testGetOccupations() { List<String> expected = new
	 * ImmutableList.Builder<String>() .add("Blogger") .add("Photographer")
	 * .add("YouTuber") .build();
	 * 
	 * ctx.currentResource("/content/byline"); Byline byline =
	 * ctx.request().adaptTo(Byline.class);
	 * 
	 * List<String> actual = byline.getOccupations();
	 * 
	 * assertEquals(expected, actual); }
	 * 
	 * @Test public void testIsEmpty() { ctx.currentResource("/content/empty");
	 * Byline byline = ctx.request().adaptTo(Byline.class);
	 * 
	 * assertTrue(byline.isEmpty()); }
	 */
    
    
}
