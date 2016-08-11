/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.video.dao.section;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author Admin
 */
class SectionMapper implements RowMapper<Section> {

    @Override
    public Section mapRow(ResultSet rs, int i) throws SQLException {
Section section = new Section();

section.setId(rs.getInt("id"));
section.setSection(rs.getString("section"));
return section;
    }

}
//  `id` INT NOT NULL AUTO_INCREMENT,
//  `section` VARCHAR(100) NULL,