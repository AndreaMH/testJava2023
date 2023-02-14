package com.example.ecommercetest.controller;

import com.example.ecommercetest.service.PriceService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(MockitoExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
@TestPropertySource(
        locations = "/application.properties")
class EcommerceControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    PriceService priceService;

    final String BASE_URL = "/ecommerce";

    @Test
    @DisplayName("Test 1: Request at 10:00 on day 14 of product 35455 for brand 1 (ZARA)")
    void givenDateAndBrandIdAndProductIdReturnPriceTestOne() throws Exception {
        String date = "2020-06-14 10:00:00";
        long brandId = 1L;
        int productId = 35455;
        MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get(BASE_URL + "/price/" + productId + "?applicationDate=" + date + "&brandId=" + brandId)
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andReturn();

        String body = result.getResponse().getContentAsString();

        assertNotNull(body);
        assertEquals(result.getResponse().getStatus(), HttpStatus.OK.value());
    }

    @Test
    @DisplayName("Test 2: Request at 16:00 on day 14 of product 35455 for brand 1 (ZARA)")
    void givenDateAndBrandIdAndProductIdReturnPriceTestTwo() throws Exception {
        String date = "2020-06-14 16:00:00";
        long brandId = 1L;
        int productId = 35455;
        MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get(BASE_URL + "/price/" + productId + "?applicationDate=" + date + "&brandId=" + brandId)
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andReturn();

        String body = result.getResponse().getContentAsString();
        assertNotNull(body);
        assertEquals(result.getResponse().getStatus(), HttpStatus.OK.value());
    }

    @Test
    @DisplayName("Test 3: Request at 21:00 on day 14 of product 35455 for brand 1 (ZARA)")
    void givenDateAndBrandIdAndProductIdReturnPriceTestThree() throws Exception {
        String date = "2020-06-14 21:00:00";
        long brandId = 1L;
        int productId = 35455;
        MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get(BASE_URL + "/price/" + productId + "?applicationDate=" + date + "&brandId=" + brandId)
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andReturn();

        String body = result.getResponse().getContentAsString();
        assertNotNull(body);
        assertEquals(result.getResponse().getStatus(), HttpStatus.OK.value());
    }

    @Test
    @DisplayName("Test 4: Request at 10:00 on day 15 of product 35455 for brand 1 (ZARA)")
    void givenDateAndBrandIdAndProductIdReturnPriceTestFour() throws Exception {
        String date = "2020-06-15 10:00:00";
        long brandId = 1L;
        int productId = 35455;
        MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get(BASE_URL + "/price/" + productId + "?applicationDate=" + date + "&brandId=" + brandId)
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andReturn();

        String body = result.getResponse().getContentAsString();
        assertNotNull(body);
        assertEquals(result.getResponse().getStatus(), HttpStatus.OK.value());
    }

    @Test
    @DisplayName("Test 2: Request at 21:00 on day 16 of product 35455 for brand 1 (ZARA)")
    void givenDateAndBrandIdAndProductIdReturnPriceTestFive() throws Exception {
        String date = "2020-06-16 21:00:00";
        long brandId = 1L;
        int productId = 35455;
        MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get(BASE_URL + "/price/" + productId + "?applicationDate=" + date + "&brandId=" + brandId)
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andReturn();

        String body = result.getResponse().getContentAsString();
        assertNotNull(body);
        assertEquals(result.getResponse().getStatus(), HttpStatus.OK.value());
    }
}