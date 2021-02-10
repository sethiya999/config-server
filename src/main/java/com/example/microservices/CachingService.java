package com.example.microservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.stereotype.Service;

@Service
public class CachingService {

//	@Autowired
	CacheManager cacheManager = new CachingConfigurerSupport().cacheManager();
	
	public void evictAllCaches() {
	    cacheManager.getCacheNames().stream()
	      .forEach(cacheName -> cacheManager.getCache(cacheName).clear());
	}
}
