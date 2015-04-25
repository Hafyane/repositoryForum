package org.forum.pmapp.controller;
import static org.junit.Assert.assertEquals;

import org.forum.pmapp.entities.Villeclt;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@ContextConfiguration("classpath:test-applicationContext.xml")
@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
public class VillecltcontrollerTest {

//    private static final String DEFAULT_NOM = "SAMPLE_TEXT";
//    private static final String UPDATED_NOM = "UPDATED_TEXT";
//    private static final String DEFAULT_DESCRIPTION = "SAMPLE_TEXT";
//    private static final String UPDATED_DESCRIPTION = "UPDATED_TEXT";
//
//	
//	@Resource(name = "villecltService")
//	private IVillecltService villecltserv;
//
//	private MockMvc restVillecltMockMvc;
//
	private Villeclt villeclt;
//
//	@PostConstruct
//	public void setup() {
//		MockitoAnnotations.initMocks(this);
//		VillecltController villecltcontroller = new VillecltController();
//		ReflectionTestUtils.setField(villecltcontroller, "villecltService",
//				villecltserv);
//		this.restVillecltMockMvc = MockMvcBuilders.standaloneSetup(
//				villecltcontroller).build();
//	}
//
//    @Before
//    public void initTest() {
//        villeclt = new Villeclt();
//        villeclt.setNom(DEFAULT_NOM);
//        villeclt.setDescription(DEFAULT_DESCRIPTION);
//    }
//
//    @Test
//    @Transactional
//    public void getNonExistingVilleclt() throws Exception {
////         Get the villeclt
//        Integer id = 15;
//        restVillecltMockMvc.perform(get("/gestion/villeclients/{id}", id))
//                .andExpect(status().isNotFound());
//    }
	
	@Before
  public void initTest() 
	{
      villeclt = new Villeclt();
      villeclt.setNom("Mohammedia");
      villeclt.setDescription("entre Mohammedia et Casablanca");
	}
    
    @Test
    public void create()
    {
    	int a;
    	a=12;
    	assertEquals(this.villeclt.getNom(),"Mohammedia");
    }
    
}
