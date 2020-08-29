package com.example.app.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.springframework.stereotype.Service;

import com.example.app.bean.BeanResponse;


@Service
public class AppService {
		
	public BeanResponse getSubAttayFindOfSum (Integer[] array ,int sum){		
		BeanResponse beanResponse = new BeanResponse();
		
		ArrayList<List<Integer>> result = new ArrayList<List<Integer>>();
		Arrays.sort(array, Collections.reverseOrder());

		for (int i = 0; i < array.length; i++) {
			int fr_index = array[i];

			for (int n = 0; n < array.length; n++) {
				List<Integer> subResult = new ArrayList<Integer>();
				int choose = array[n]; // 3
				int plusSum = 0;

				subResult.add(fr_index);
				plusSum += fr_index;

				do {
					subResult.add(choose);
					plusSum += choose;

				} while (plusSum != sum && plusSum < sum);

				if (plusSum == sum) {
					if (result.size() == 0) {
						result.add(subResult);
					} else {
						boolean isDup = false;
						for (List<Integer> list : result) {
							Collections.sort(list);
							Collections.sort(subResult);
							if (list.equals(subResult)) {
								isDup = true;
								break;
							}
						}
						if (!isDup)
							result.add(subResult);
					}
				}
			}
		}
		beanResponse.setErrorCode(0);
		beanResponse.setErrorMessage("success");
		beanResponse.setResult(result);
		return beanResponse;
	}
}
