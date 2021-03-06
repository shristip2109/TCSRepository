/**
 * 
 */
package com.tcs.dao;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.tcs.model.Grades;
/**
 * @author springuser10
 *
 */
@Repository
public class ProfessorDao {
	
	//dummy database for Student Result information.
	
			private static List<Grades> grades;
			{ 
				grades = new ArrayList<Grades>();
				grades.add(new Grades(02, "abc", 05, "Java", "A"));
				grades.add(new Grades(03, "abc", 05, "Java", "a1"));
				grades.add(new Grades(04, "abc", 05, "Java", "a2"));
				
			}
			
			
			public List<Grades> list() {
				return grades;
			}
			
			//Get the Result details with id 

					public Grades get(Long id) {

						for (Grades res : grades) {
							if (res.getId()==(id))
									
							
								return res;
							
						}
						return null;
					}
					
					//Create Result
					public Grades create(Grades r) {
						r.setId(System.currentTimeMillis());
						grades.add(r);
						return r;
					}
					
					//Update Result
					public Grades update(Long id, Grades r) {

						for (Grades c : grades) {
							if (c.getId().equals(id)) {
								r.setId(c.getId());
								grades.remove(c);
								grades.add(r);
								return r;
							}
						}

						return null;
					
					}
					
}