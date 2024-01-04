package com.example.dbcafe.domain.admin.setting;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SettingRepository extends JpaRepository<Setting, Integer> {
    Setting findByName(String name);
}
