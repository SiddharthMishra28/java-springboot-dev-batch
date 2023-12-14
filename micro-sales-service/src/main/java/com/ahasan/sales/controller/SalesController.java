package com.ahasan.sales.controller;

import com.ahasan.sales.common.messages.BaseResponse;
import com.ahasan.sales.dto.SalesDTO;
import com.ahasan.sales.service.SalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Validated
@RestController
@RequestMapping("/sales")
public class SalesController {

	@Autowired
	private SalesService salesService;

	@GetMapping(value = "/find")
	public ResponseEntity<List<SalesDTO>> getAllSales() {
		List<SalesDTO> list = salesService.findSalesList();
		return new ResponseEntity<List<SalesDTO>>(list, HttpStatus.OK);
	}

	@GetMapping(value = "/find/by-id")
	public ResponseEntity<SalesDTO> getSalesById(@RequestParam Long id) {
		SalesDTO list = salesService.findBySalesId(id);
		return new ResponseEntity<SalesDTO>(list, HttpStatus.OK);
	}

	@GetMapping(value = "/find/name/by-id")
	public ResponseEntity<SalesDTO> getSalesNameById(@RequestParam Long id) {
		SalesDTO list = salesService.findBySalesId(id);
		return new ResponseEntity<>(list, HttpStatus.OK);
	}

	@PostMapping(value = { "/add", "/update" })
	public ResponseEntity<BaseResponse> createOrUpdateSales(@RequestBody SalesDTO userDTO) {
		BaseResponse response = salesService.createOrUpdateSales(userDTO);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	@DeleteMapping(value = "/delete/{id}")
	public ResponseEntity<BaseResponse> deleteSalesById(@PathVariable("id") Long id) {
		BaseResponse response = salesService.deleteSales(id);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

}
